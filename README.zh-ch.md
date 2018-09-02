
# 项目

spring boot 2.x 模板

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

