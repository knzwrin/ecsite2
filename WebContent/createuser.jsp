<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<style type="text/css">
	.header{
		width: 100%;
		height: 70px;
   		background-color: black;
   		line-height: 70px;
   		text-align: center;
   		font-size: 30px;
   		color: white;
	}

	.test{
		text-align: center;
		border-bottom: 5px solid black;
	}
    th{
        background-color: black;
        color:white;
    }
    .item{
        background-color: gray;
        text-align: center;
    }

    table{
    		width:100%;
		display: flex;
  		justify-content: center;
  		align-items: center;
    }
    h3{
    text-align: center;
    }
    h4{
    text-align: center;
    color: red;
    }
	</style>
<title>ユーザー登録画面</title>
</head>
<body>
<div class="header">
ユーザー登録ページ
</div>
<h3>お客様の情報を登録します。</h3>
<s:if test="errorMassage!=null">
<h4>*<s:property value="errorMassage"/>*</h4>
</s:if>
<s:form action="CreateUserAction">
<table>
    <tr>
        <th></th><th>登録内容</th>
    </tr>
    <tr>
        <td class="item">名前</td><td><input size="50" type="text" name="userName"/><br>＊6文字以上10文字以内</td>
    </tr>
    <tr>
        <td class="item">パスワード</td><td><input size="50" type="password" name="password"/><br>＊8文字以上16文字以内</td>
    </tr>
     <tr>
        <td class="item">郵便番号</td><td><input size="50" type="text" name="postalCode"/><br>例）120-0015</td>
    </tr>
    <tr>
        <td class="item">住所</td><td><input size="50" type="text" name="address"/><br>例）東京都新宿区○-○-○<br>（あればアパートまたはマンション名を続けてお入れください）</td>
    </tr>
    <tr>
        <td class="item">電話番号</td><td><input size="50" type="text" name="tell"/><br>例）000-0000-0000</td>
    </tr>
    <tr>
        <td class="item">メールアドレス</td><td><input size="50" type="text" name="email"/><br>例）sample@softbank.ne.jp</td>
    </tr>
    <s:submit value="登録"/>
</table>
    </s:form>
</body>
</html>
