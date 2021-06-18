# How to use Redis

- Start Docker Redis:
```shell
    docker run -it --name redis -p 6379:6379 redis:5.0.3
```
- Access Cli Redis:
```shell  
  docker exec -it redis /bin/bash
  redis-cli
```
- List Keys:
```shell
  KEYS *
```
- Read
```shell
  get "person::SimpleKey []"
```
- Delete Key
```shell
  del "person::60a05c853ef1496e054405b6"
```
# Configure Redis in Springboot (application.properties):

- Server
```java
  spring.cache.type=redis
  spring.redis.host=localhost
  spring.redis.port=6379

  #Tempo estimado em 5 Segundos
  
  spring.cache.redis.time-to-live:5000
```
# Application Controller

- Cacheable:
```java
  import org.springframework.cache.annotation.Cacheable;
```
- Código: 

```java
    @GetMapping("/api/person/{id}")
    @Cacheable("person")
    public Person findById(@PathVariable("id") String id){
        System.out.println("Find Information.. " + id);
        return personService.findById(id);
        
    }
```
