<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <%--修改问题
        1.考虑事务
        2.考虑sql
    --%>
    <form action="${pageContext.request.contextPath}/book/update" method="post">
        <input type="hidden" name="bookID" value="${queryBooks.bookID}"/>
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" name="bookName" class="form-control" id="bookName" value="${queryBooks.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bookCount">书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" id="bookCount" value="${queryBooks.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" name="detail" class="form-control" id="detail" value="${queryBooks.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" value="修改">
        </div>

    </form>

</div>
</body>
</html>
