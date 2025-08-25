# JDK 8
FROM openjdk:8-jdk-slim

# Install maven and some utilities
RUN apt-get update && \
    apt-get install -y maven git curl vim unzip && \
    rm -rf /var/lib/apt/lists/*

# Workspace directory
WORKDIR /workspace

CMD ["bash"]
