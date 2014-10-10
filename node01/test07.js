/*
 * 요청 파라미터의 값 꺼내기
 - 클라이언트가 보낸 데이터(요청 파라미터)


 */
var name;
var http = require('http'); // http 객체 가져오기

var url = require('url'); // url 객체 가져오기

http.createServer(function handler(req, res) {
	var urlInfoMap = url.parse(req.url, true);
	name = urlInfoMap.query.name;
	//클라이언트가 보낸 name 파라미터 값을 변수에 저장
    res.writeHead(200, {'Content-Type': 'text/html;charset=UTF-8'});
    res.write('<html><head><title>test문제</title></head>');
    res.write('<body>');
    res.write('<h1>안녕하세요!' + name + '님!</h1>');
    res.write('<p>자바스크립트만 제대로'+
    		'배워도 서버측 애플리케이션을');
    res.write('개발할 수 있다. </p>');
    res.write('</body></html>');
    res.end();
	console.log('okok33');
}).listen(1337, '127.0.0.1');
console.log('Server running at http://127.0.0.1:1337/');
