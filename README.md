
# 项目

spring boot 2.x 模板,附带了Concourse-CI的构建模板

maven分支那里附带了一个私有依赖,那个忽略即可.

- fly命令
```bash
fly  -t zeusro set-pipeline -p spring-boot-template -c concourse-ci-pipeline.yaml \
-v "name=spring-boot-template" \
-v "repouri=ssh://git@github.com:zeusro/spring-boot-template.git" \
-v "repo-key=$(cat ~/.ssh/id_rsa)"  \
-v "dependency1uri=ssh://<基础依赖的仓库>" \
-v "image-name=<打包的阿里云镜像名称>"  \
-v "image-username=<登录镜像的用户名>"  \
-v 'image-password=<登录镜像的密码>'  ;
```

- 插件构建的方式
``` bash
gradle build -x test --debug docker ;
# 或者
gradle build -x test  docker ;
export image=;
export version=`docker image ls $image | grep -Eo '([0-9]{0,2}\.){2}[0-9]+'| head -1`;
echo '即将推送镜像'$image:$version;
docker push $image:$version;
docker push $image':latest'
```

