inherit overlayfs

OVERLAYFS_MOUNT_POINT[home] = "/data"
OVERLAYFS_WRITABLE_PATHS[home] = "/home"
OVERLAYFS_QA_SKIP[home] = "mount-configured"

OVERLAYFS_MOUNT_POINT[netplan] = "/data"
OVERLAYFS_WRITABLE_PATHS[netplan] = "/etc/netplan"
OVERLAYFS_QA_SKIP[netplan] = "mount-configured"


OVERLAYFS_MOUNT_POINT[netplan] = "/data"
OVERLAYFS_WRITABLE_PATHS[netplan] = "/etc/netplan"

OVERLAYFS_MOUNT_POINT[ssh] = "/data"
OVERLAYFS_WRITABLE_PATHS[ssh] = "/etc/ssh"
