#!/bin/sh

set -e

INSTALL_DIR_BASE="/usr/lib/mickoo"
INSTALL_DIR="${INSTALL_DIR_BASE}/android-jaxb"
TMP_DIR="/tmp/mickoo/androidjaxb"
JAR_FILE="android-jaxb-1.0.1.jar"
DOWNLOAD_URL="https://s3.amazonaws.com/yeshodhan/${JAR_FILE}"

mkdir -p ${INSTALL_DIR}
mkdir -p ${TMP_DIR}
cd ${TMP_DIR}
echo "Downloading AndroidJAXB from ${DOWNLOAD_URL}"
curl -O "${DOWNLOAD_URL}"
echo "Installing ..."
mv ${JAR_FILE} ${INSTALL_DIR}
cd ${INSTALL_DIR}
echo "java -jar ${INSTALL_DIR}/${JAR_FILE} \"\$@\"" > androidjaxb
#rm /usr/bin/androidjaxb
ln -n androidjaxb /usr/bin/androidjaxb
chmod +x /usr/bin/androidjaxb
echo "Installation Complete"
androidjaxb