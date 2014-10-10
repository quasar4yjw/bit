/* GET 요청과 POST 요청 구분하기
 - request.method 프로퍼티의 값을 확인하라!
 */
var http = require('http'); // http 객체 가져오기
var url = require('url'); // url 객체 가져오기

var qs = require('querystring');
http.createServer(function handler(req, res) {
	res.writeHead(200, {'Content-Type': 'text/html;charset=UTF-8'});
	var urlInfoMap = url.parse(req.url, true);
	var v1;
	var v2;
	var cpu;

	if (req.method == 'GET'){




		v1 = parseInt(urlInfoMap.query.v1);
		v2 = parseInt(urlInfoMap.query.v2);
		cpu = urlInfoMap.query.op;
        displayoo(req,res,v1,v2,cpu);
		

	}
	else if(req.method =='POST') {
		var body='';
        
		req.on('data', function (data) {

			body +=data;

		});

		req.on('end',function(){

			console.log(body);

			var POST =  qs.parse(body);

			console.log(POST);
			 v1 = parseInt(POST.v1);
			 v2 = parseInt(POST.v2);
			 cpu = POST.op;
			 displayoo(req,res,v1,v2,cpu);
		});
	}


	//클라이언트가 보낸 name 파라미터 값을 변수에 저장

	
	console.log('okok33');
}).listen(1337, 'localhost');
console.log('Server running at http://127.0.0.1:1337/');

function displayoo(req, res, v1, v2, cpu){
	res.write('<html><head><title>test문제</title></head>');
	res.write('<body>');
	
	if(cpu == 'plus'){
		res.write(v1+" + "+v2+" = "+(v1+v2));
	}else if(cpu == 'minus'){
		res.write(v1+" - "+v2+" = "+(v1-v2));
	}else if(cpu == 'multiple'){
		res.write(v1+" * "+v2+" = "+v1*v2);
	}else if(cpu == 'devide'){
		res.write(v1+" / "+v2+" = "+v1/v2);
	}else{
		res.write("연산자 없어요"); 
		console.log("연산자 없어요");}
	
	res.write('<p>자바스크립트만 제대로'+
	'배워도 서버측 애플리케이션을');
	res.write('개발할 수 있다. </p>');
	res.write('</body></html>');
	res.end();
}

