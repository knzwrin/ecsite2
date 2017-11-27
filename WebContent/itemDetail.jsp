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
   		 background-color: black;
	}

	.menu ul{
    	margin: 0;
    	padding: 0;
    	list-style: none;
	}

	.menu li a{
	    display: block;
	    padding: 15px;
	    color: white;
	    font-size: 14px;
	    text-decoration: none;
		text-align:center;
	}

	.menu li a:hover{
	    background-color: lightgrey;
	}

	.menu ul:after{
	    content: "";
	    display: block;
	    clear: both;
	}

	.menu li{
	    float: left;
	    width: 150px;
	}
	.iteminfo{
		width:100%;
		margin-top: 50px;
		display: flex;
  		justify-content: center;
  		align-items: center;
  		height: 100%;
  		text-align: center;
	}

	img{
		width: 300px;
		height: 300px;
	}

		.footer{
		position: fixed;
		bottom: 0px;
	    width: 100%;
	    height: 50px;
	    background-color: black;
	    color: white;
	    line-height: 50px;
	    text-align: center;
	}
	</style>
<title>詳細情報</title>
</head>
<body>
        <div class="header">
            <nav class="menu">
                <ul>
                    <li><a href="">ECSITE</a></li>
                    <li><a href='<s:url action="GoLoginAction" />'>ログイン</a></li>
                    <li><a href="">マイページ</a></li>
                </ul>
            </nav>
        </div>
<div class="iteminfo">
<s:form action="BuyItemAction">
			<table>
				<tr>
					<td>
						<span>商品名:<s:property value="#session.itemName" /><br></span>
					</td>
				</tr>
				<tr>
					<td>
					<img src ="<s:property value="#session.itemImg" />">
					</td>
				</tr>
				<tr>
					<td>
					<span><s:property value="#session.itemDetail" /></span>
					</td>
				</tr>
				<tr>
					<td>
						<span>値段</span>
					</td>
					<td>
						<s:property value="#session.itemPrice" /><span>円</span>
					</td>
				</tr>
				<tr>
					<td>
						<span>購入個数</span>
					</td>
					<td>
						<select name="count">
							<option value="1" selected="selected">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<span>支払い方法</span>
					</td>
					<td>
						<input type="radio" name="pay" value="1" checked="checked">現金払い
						<input type="radio" name="pay" value="2">クレジットカード
						<input type="radio" name="pay" value="3">コンビニ・郵便局受け取り
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value="購入" />
				</tr>
			</table>
</s:form>
</div>

        <div class="footer">footer</div>
</body>
</html>