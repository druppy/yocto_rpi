require recipes-core/images/core-image-minimal.bb 

IMAGE_INSTALL += "libstdc++ mtd-utils opkg" 
IMAGE_INSTALL += "openssh openssl openssh-sftp-server" 
