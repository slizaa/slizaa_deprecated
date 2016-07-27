#! /bin/bash

echo TRAVIS_BUILD_DIR: $TRAVIS_BUILD_DIR

PRODUCTS_DIR=$TRAVIS_BUILD_DIR/03-org.slizaa.neo4j.jqassistant/org.slizaa.neo4j.jqassistant.product/target/products
echo PRODUCTS_DIR: $PRODUCTS_DIR

filesToUpload=$(find $PRODUCTS_DIR -name "slizaa-*.zip" -printf '%f\n')
echo filesToUpload: $filesToUpload

# change the working directory
cd $PRODUCTS_DIR

# upload all files
for localFile in $filesToUpload;
do
  echo "Uploading $localFile"
  curl -u $user:$password -T $localFile ftp://ftp.wuetherich.com
done
