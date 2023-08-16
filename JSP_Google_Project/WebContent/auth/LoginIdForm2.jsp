<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>로그인 아이디입력2</title>
   <style type="text/css">
      p{
         font-size: 14px;
      }
      
      #firstDiv{
         border-radius: 10px;
         border: 1px solid #E5E5E5;
         height: 416px;
         width: 370px; 
         padding: 48px 40px 36px;
               
                  
      }
      
      #firstDiv{
         margin: auto;
      }
      
      #lastDiv {
         display:flex;
         justify-content: center;
         
      }
      
      html, body{
         margin-top: 80px;
      }                  
      
      h2, #firstPtag{
         text-align: center;
      }
            
      #firstAtag, #secondAtag, #thirdAtag{
         color: blue;
      }
      
      #firstAtag, #thirdAtag, #secondAtag, #Atag1, #Atag2, #Atag3{
         text-decoration-line: none; 
      }
      
      #Atag1, #Atag2, #Atag3{
         margin-right: 28px; 
      }
      
      #next{
         font-size: 15px;
         height: 40px;
         width: 80px;
         color: white;
         background-color: blue;
         float: right;
         border-radius: 5px;
      }
      
      
      
      #idInput{
         border: 1px solid red;         
         width: 340px;
         height: 50px;
         font-size: 18px;
         padding-left: 20px;
         border-radius: 5px;
      }
      
            
      #idInput:focus{
         border-color: red;
         outline: none;
      }
      
      
      #googleDiv{
          font-size: 30px;
          text-align: center;
       }
      
      #firstGoogle{
         color: #4285F4;
         letter-spacing: -10px;
      }
      
      #secondGoogle{
         color: #EA4335;
         letter-spacing: -10px;
      }
      
      #thirdGoogle{
         color: #FBBC05;
         letter-spacing: -10px;
      }
      
      #fourthGoogle{
         color: #4285F4;
         letter-spacing: -10px;
      }
      
      #fifthGoogle{
         color: #34A853;
         letter-spacing: -10px;
      }
      
      #sixthGoogle{
         color: #EA4335;
         letter-spacing: -10px;
      }
      
      
      
      select{
         border: none;
         width: 200px;
      }
   
   
   </style>
   <script type="text/javascript">
      
      function nextFnc() {
         var myInput = document.getElementById('idInput');
         var hidePTag = document.createElement('hide');
         var hide2PTag = document.createElement('hide2');
         var hide3PTag = document.createElement('hide3');
         var hide4PTag = document.createElement('hide4');
         var myObj = document.getElementById('inputDiv');
            if (!myInput.value) {
               myInput.style.borderColor = 'red';               
               document.getElementById('hide').style.display = 'block';         
               document.getElementById('hide2').style.display = 'block';
               document.getElementById('hide3').style.display = 'none';
               document.getElementById('hide4').style.display = 'none';
               event.preventDefault();
            }   
                                    
      }   
         

      
   
   </script>
</head>

<body>
   
   <div id='totalDiv'>
   <div id= 'firstDiv'>
   <div id ='googleDiv'>
      <a id='firstGoogle'>G</a>
      <a id='secondGoogle'>o</a>
      <a id='thirdGoogle'>o</a>
      <a id='fourthGoogle'>g</a>
      <a id='fifthGoogle'>l</a>
      <a id='sixthGoogle'>e</a>
   </div>
   <h2>로그인</h2>
   <p id='firstPtag'>Google 계정 사용</p>
   <form action="./loginId" method="post">
      <div id='inputDiv'>
               
      <input id='idInput' type="text" name="email" placeholder="이메일 또는 휴대전화" onfocus="this.placeholder = ''" onblur="this.placeholder = '이메일 또는 휴대전화'"/>
      </div>
      
      <span id='hide' style="display:none; color: red;">
      <img id='hide2'src="./icon.png" style="display: none; float: left;">
      이메일이나 전화번호를 입력하세요</span>
      <span id='hide3' style="display:block; color: red;">
      <img id='hide4'src="./icon.png" style="display: block; float: left;">
      Google 계정을 찾을 수 없습니다.</span>            
      <br>
      <a id='firstAtag' href="./FindEmailForm.jsp">이메일을 잊으셨나요?</a><br><br>            
      <p>내 컴퓨터가 아닌가요? 게스트 모드를 사용하여 비공개</p>   
      <a>로 로그인하세요.</a>
      <a id='secondAtag' href="">자세히 알아보기</a><br><br>
      <a id='thirdAtag' href="../member/add1">계정 만들기</a>      
      <input id='next' type="submit" value="다음" onclick="nextFnc();">
      
   </form>
   
   </div>
   <br>   
   <div id='lastDiv'>
      <select>
         <option>한국어</option>
      </select>
      <a id='Atag1' href="">도움말</a>
      <a id='Atag2' href="">개인정보방침  </a>
      <a id='Atag3' href="">약관</a>
   </div>   
   </div>
      
</body>
</html>