#!/bin/bash


CP=
for i in $(ls libs/) ; do
   CP="libs/$i:$CP"
done

javac -cp $CP Whatever.java
