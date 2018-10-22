## Repro project for SPR-12550

See issue [SPR-12550 on jira](https://jira.spring.io/browse/SPR-12550).

To launch this project, use:

    mvn clean package cargo:run -Ptomcat8,debug

The following will wrap with a no-op `HttpServletRequestWrapper` in [HttpServletRequestResponseWrapperFilter](src/main/java/org/springframework/issues/config/HttpServletRequestResponseWrapperFilter.java) which prevents the resource path from being modified.

```
curl 'http://localhost:8080/SPR-12550/main/home?wrapRequest=1' 


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
  <link href="/SPR-12550/main/static/style.css;jsessionid=1D95CD85044C3CBAB00824E2F598D81E" rel="stylesheet"  type="text/css" />
</head>
<body>
  <h1>Home</h1>
  <p>/SPR-12550/main/static/style.css;jsessionid=1D95CD85044C3CBAB00824E2F598D81E</p>
</body>
</html>
```

The following will not wrap with a `HttpServletRequestWrapper` which ensure the resource url is modified:

```
curl 'http://localhost:8080/SPR-12550/main/home'              


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
  <link href="/SPR-12550/main/static/style-5c665ffcd1ac08385128a11fb8264232.css;jsessionid=89009437EB5941BECF61801EABC633A3" rel="stylesheet"  type="text/css" />
</head>
<body>
  <h1>Home</h1>
  <p>/SPR-12550/main/static/style-5c665ffcd1ac08385128a11fb8264232.css;jsessionid=89009437EB5941BECF61801EABC633A3</p>
</body>
</html>
```