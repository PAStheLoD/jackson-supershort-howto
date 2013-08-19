#!/bin/bash


mkdir -p libs
cd libs


wget 'http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.2.2/jackson-annotations-2.2.2.jar'
wget 'http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.2.2/jackson-core-2.2.2.jar'
wget 'http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.2.2/jackson-databind-2.2.2.jar'

cd ..

