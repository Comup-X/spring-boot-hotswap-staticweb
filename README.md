# SpringBoot静态网站实践
- 详见代码注释


# 热部署
- 热部署需要如下依赖
````
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
</dependency>
````
- 如果是IDEA需要启用如下功能
````
ctrl+alt+s -> Build,Execution,Deployment -> Compiler -> Build project automatically
````
````
ctrl+alt+shift+/ -> registry中的 compiler.automake.allow.when.app.running
````
- Eclipse本人未使用不清楚是否需要额外设置