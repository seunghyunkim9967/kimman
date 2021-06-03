package PC_prac;

public class Json {

	
	
	
	/*
	 * JSON interface로 가서 보게되면 동일한 이름의 함수가 2개 있고 전달되는 매개변수가 약간 차이가 있는데 이것을 오버로딩 이라고
	 * 한다. (함수의 이름은 동일하지만 어떤 파라미터를 전달하냐 몇개의 파라미터를 전달하냐 에따라서 각각 다른방식으로 전달)
	 * 
	 * 1. Object to JSON ( 오브젝트를 제이슨으로 변환) // stringify(obj)
	 * 
	 * let json = JSON.stringify(true); console.log(json); (콘솔결과 true)
	 * 
	 * 
	 * 배열을 제이슨으로 변환 json = JSON.stringify(['apple', 'banana']); console.log(json);
	 * (결과)["apple", "banana"] 싱글 쿼트가 아닌 더블 쿼트로 들어가있다. 제이슨의 규격사항이다.
	 * 
	 * 오브젝트를 제이슨으로 변환
	 * 
	 * const rabbit = { name: 'tori', color: 'white', size : null, brithDate: new
	 * Date(), jump: () => { console.log('${name} can jump!'); }, };
	 * 
	 * json = JSON.stringify(rabbit); console.log(json);
	 * 
	 * 
	 * (콘솔결과) {"name":"tori" ,"color":"white","size":null,
	 * "brithDate":"2021-05-31T13:20:22.670Z"} jump함수는 Json에 포함되지 않는것을 확인할 수 있다. 함수는
	 * Object에 있는 데이터가 아니기 때문에 함수는 제외되고
	 * 
	 * Json으로 변환되는것을 조금 더 통제하고 싶다면 (이름과 색깔만 전달하고싶다!) 원하는 프로퍼티만 골라서 정의를 할 수 있다.! json
	 * = JSON.stringify(rabbit, ['name', 'color']); console.log(json);
	 * 
	 * 조금 더 세밀하게 통제하고싶다(콜백함수) json = JSON.stringify(rabbit, (key, value) =>{
	 * console.log('key: ${key}', value: ${value}'); return value; } );
	 * console.log(json); (결과) key: , value: [object Object] key: name, value: tori
	 * key:color value:white key:size value:null key:생년월일 value:데이트 key:jump, value:
	 * () =>{ console.log('${name} can jump!'); } {"name":"tori"
	 * ,"color":"white","size":null, "brithDate":"2021-05-31T13:20:22.670Z"}
	 * 
	 * 
	 * 만약 여기서 이름을 ellie로 바꾸겠다 하면 json = JSON.stringify(rabbit, (key, value) =>{
	 * console.log('key: ${key}', value: ${value}'); return key === 'name' ? 'ellie'
	 * : value; } ); 2. JSON to Object //parse(json)
	 * 
	 * json = JSON.stringify(rabbit);
	 * 
	 * const obj = JSON.parse(json); console.log(obj); (결과) {name: "tori", color:
	 * "white", ....} rabbit.jump(); (결과) can jump! obj.jump(); 를 할 경우 JSON으로 변환한
	 * object에는 jump 함수가 포함되어 있지 않았기 때문에 없어서 실행이 되지 않는다.
	 * 
	 * console.log(rabbit.birthDate.getDate()); (결과) 29
	 * console.log(obj.birthDate.getDate()); (결과) 에러발생 -> 이 birthDate는 스트링이기 때문에
	 * console.log(obj.birthDate); (결과) 2021-05-31T13:20:22.670Z Json으로 만든 데이터 자체에
	 * 있는 스트링이 오브젝트에 할당이 된것.
	 * 
	 * 
	 * 그렇기 때문에 const obj = JSON.parse(json); 부분을 const obj = JSON.parse(json,
	 * (key,value) => { console.log('key: ${key}', value: ${value}'); 키가 birthDate면
	 * Date라는 오브젝트를 만들거고 key가 bireDate가 아니면 value를 그대로 쓰자 라는 뜻 return key ===
	 * 'birthDate' ? new Date(value) : value; });
	 * 
	 * console.log(obj.birthDate.getDate()); (결과) 29
	 */
}

