#!/bin/sh

SCRIPT="$0"

while [ -h "$SCRIPT" ] ; do
  ls=`ls -ld "$SCRIPT"`
  link=`expr "$ls" : '.*-> \(.*\)$'`
  if expr "$link" : '/.*' > /dev/null; then
    SCRIPT="$link"
  else
    SCRIPT=`dirname "$SCRIPT"`/"$link"
  fi
done

if [ ! -d "${APP_DIR}" ]; then
  APP_DIR=`dirname "$SCRIPT"`/..
  APP_DIR=`cd "${APP_DIR}"; pwd`
fi

executable="./modules/swagger-codegen-cli/target/swagger-codegen-cli.jar"

if [ ! -f "$executable" ]
then
  mvn clean package
fi

#
# For swift
#
# if you've executed sbt assembly previously it will use that instead.
export JAVA_OPTS="${JAVA_OPTS} -XX:MaxPermSize=256M -Xmx1024M -DloggerPath=conf/log4j.properties"
ags="$@ generate -t modules/swagger-codegen/src/main/resources/swift3/touchvie -i modules/swagger-codegen/src/main/resources/touchvie/api-server.json -l swift  -c ./bin/touchvie/swift-touchvie.json -o samples/client/touchvie/swift/default"

java $JAVA_OPTS -jar $executable $ags

#
# For TypeScript
#
ags="$@ generate -t modules/swagger-codegen/src/main/resources/TypeScript-Fetch/touchvie -i modules/swagger-codegen/src/main/resources/touchvie/api-server.json -l typescript-fetch -c ./bin/touchvie/swift-touchvie.json -o samples/client/touchvie/typeScript(Fetch)/default"

java $JAVA_OPTS -jar $executable $ags

#
# For Android
#
ags="$@ generate -t modules/swagger-codegen/src/main/resources/android/touchvie -i modules/swagger-codegen/src/main/resources/touchvie/api-server.json -l android --library=volley -c ./bin/touchvie/swift-touchvie.json -o samples/client/touchvie/android/default"

java $JAVA_OPTS -jar $executable $ags


