# jQueryAjaxJavaWeb
jQueryAjax在JavaWeb中的应用


1、themeleaf的使用：通过httpURL访问html，这里使用string字符串匹配html文件。
2、ajax前端获取数据

success: function (result) {
            showData(result);
        }
        
这里的result为后台定义的数据类型的对象，前端处理根据该数据类型进行处理，可通过浏览器打断点查看该对象数据结构。        