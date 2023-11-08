FROM ubuntu:latest
LABEL authors="furyj"

ENTRYPOINT ["top", "-b"]
