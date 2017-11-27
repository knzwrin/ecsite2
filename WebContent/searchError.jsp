<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>検索結果なし</title>
</head>
<body>
<h2>もう一度検索をお願いします。</h2>
<h3>検索例</h3>
<p>「服」</p>
<p>「服　メンズ」</p>
<p>×「服メンズ」</p>
<s:form action="BackWordSearchAction">
<s:submit value="検索画面に戻る"/>
</s:form>
</body>
</html>