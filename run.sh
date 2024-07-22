#!/bin/bash

# Define directories
SRC_DIR="src"
BUILD_DIR="build/classes"
RESOURCES_DIR="resources"

# Function to clean the build directory
clean() {
    echo "Cleaning build directory..."
    rm -rf $BUILD_DIR
    echo "Build directory cleaned."
}

# Function to compile the Java files
compile() {
    echo "Compiling Java files..."
    mkdir -p $BUILD_DIR
    javac -d $BUILD_DIR $SRC_DIR/*.java
    echo "Compilation finished."
}

# Function to run the Main class
run() {
    echo "Running the Main class..."
    java -cp $BUILD_DIR:$RESOURCES_DIR Main
}

# Check the command-line argument
if [ "$1" == "clean" ]; then
    clean
else
    compile
    run
fi
