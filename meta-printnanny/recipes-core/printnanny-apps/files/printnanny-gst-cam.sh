#!/bin/bash
set +xeuo pipefail

export VIDEO_HEIGHT="480"
export VIDEO_WIDTH="640"
export H264_LEVEL="4"
export FRAMERATE="24/1"
export DOWNSAMPLE_RATE="1/1"
export RAW_VIDEO_SOCKET_PATH=/var/run/printnanny/video-raw.socket
VIDEO_FILENAME="$(printnanny config get paths.new_video_filename)"
export VIDEO_FILENAME="$VIDEO_FILENAME"
# TODO
# EDGE_RTP_HOST="$(printnanny config get pi.webrtc_edge.video_rtp_domain)"
# export EDGE_RTP_HOST=$RTP_HOST
# EDGE_RTP_PORT="$(printnanny config get pi.webrtc_edge.video_rtp_port)"
# export EDGE_RTP_PORT=RTP_PORT

CLOUD_RTP_HOST="$(printnanny config get pi.webrtc_cloud.rtp_domain)"
export CLOUD_RTP_HOST=$RTP_HOST
CLOUD_RTP_PORT="$(printnanny config get pi.webrtc_cloud.video_rtp_port)"
export CLOUD_RTP_PORT=RTP_PORT

gst-launch-1.0 -v \
    libcamerasrc \
    ! "video/x-raw,width=$VIDEO_WIDTH,height=$VIDEO_HEIGHT,framerate=$FRAMERATE,format=RGB" \
    ! v4l2convert \
    ! tee name=t0 \
    ! queue leaky=2 \
    ! shmsink socket-path="$RAW_VIDEO_SOCKET_PATH" wait-for-connection=false \
    t0. ! queue ! "video/x-raw,width=$VIDEO_WIDTH,height=$VIDEO_HEIGHT,framerate=$FRAMERATE,format=RGB" \
        ! v4l2h264enc extra-controls='controls,repeat_sequence_header=1' \
        ! "video/x-h264,width=$VIDEO_WIDTH,height=$VIDEO_HEIGHT,framerate=$FRAMERATE,level=(string)4,format=RGB" \
        ! tee name=t1 \
        ! rtph264pay config-interval=1 aggregate-mode=zero-latency pt=96 \
        ! queue2 \
        ! udpsink host="$CLOUD_RTP_HOST" port="$CLOUD_RTP_HOST"
    t1. filesink location="$VIDEO_FILENAME"
