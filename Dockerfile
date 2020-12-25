FROM jboss/wildfly
COPY target/jenkins-pipeline-test-project.war /opt/jboss/wildfly/standalone/deployments/
