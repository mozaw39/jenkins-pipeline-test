FROM jboss/wildfly
COPY /${env.WORKSPACE}/jenkins-test/target/jenkins-pipeline-test-project.war /opt/jboss/wildfly/standalone/deployments/
