# Ansible playbook to install Jenkins on CentOS7 machines

This Ansible manifest will install Docker, Docker compose and configure a Systemd service to start Jenkins on a EL7 server.

## Pre Requisites:

CentOS7

## Install

edit jenkins.yml to point to the host you're installing on and then run:

```ansible-playbook -vvv jenkins.yml```
