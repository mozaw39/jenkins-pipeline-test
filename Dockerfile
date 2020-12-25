FROM jboss/wildfly
ENV JENKINS_HOME /var/jenkins_home
VOLUME /var/jenkins_home
COPY target/jenkins-pipeline-test-project.war /opt/jboss/wildfly/standalone/deployments/
