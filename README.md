> Conveniently repacked
# SmartGWT Showcase

That's all you need to get the showcase running:

```shell-script
mvn clean isc:install gwt:run
```

** NOTE **

The current 6.1d2017-05-27 does not include tahoe and simplicity themes, I had to comment them out from the .gwt.xml file in order to get the project to compile.
You may experience messed up UI first time your run (Tahoe is default, and missing, theme), just pick a different theme from the messed up theme dropdown.