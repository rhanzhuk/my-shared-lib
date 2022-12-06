#!/usr/bin/env groovy

def call(args) {
    sh(script: "docker {$args}")
}
