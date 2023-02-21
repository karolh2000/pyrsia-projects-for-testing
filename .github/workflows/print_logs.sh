#!/bin/bash

echo "Wait for a minute...."
sleep 1m
echo "Check if Tekton CLI installed..."
tkn --help
echo "Print taskrun list"
tkn taskrun list
echo "Show logs for the taskrun..."
tkn taskrun logs build-run