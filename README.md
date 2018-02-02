### OAuth2 Client - test access token


`GET` Need read scope

```
$ curl -H "Authorization: Bearer $TOKEN" "localhost:9090/users"
```

`POST` Need write scope

```
$ curl -XPOST -H "Authorization: Bearer $TOKEN" "localhost:9090/users"
```
