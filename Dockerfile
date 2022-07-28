FROM ivonet/payara:5.193.1
COPY ./artifact/MSASecondApp.war $DEPLOY_DIR
