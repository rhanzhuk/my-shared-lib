#!/usr/bin/env groovy

def call() {
    sh(script: "docker run -v $env.WORKSPACE:/opt/maven -w /opt/maven  maven mvn clean install -Dmaven.test.skip=true")
}

// Собираем имедж Мавена с помощью контенера мавен


