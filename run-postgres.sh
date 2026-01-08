#!/bin/bash
docker run -d --name postgres-taskflow -e POSTGRES_DB=taskflow -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 postgres:16