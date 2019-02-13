


var obj = new Object();
var obj = {};
obj.name='Welcome';
obj['name']="welcome";

var obj1={
'name':'Welcome',
	details:{
		age:25,
		city:'NY'}
	};

console.log(obj1.details.age);
console.log(obj1['details']['city']);
console.log(Object.keys(obj1));

var arr = new Array();
var arr=[];
arr[0] = 'First';
arr[1] = 'Second';
console.log(arr.length);
var animal = ['lion', 'tiger','elephant']
animal[99] = 'fox';
console.log(animal.length);
var str2 = '{"name":"ashes","age":25,"author":"myself","company":"cogent"}';
var obj3=JSON.parse(str2);
console.log(obj3.author);
var first="Ashoka";
var second="Ranadheer";
let list = [first,second];
console.log(first); console.log(second);
function f1(first,second){
	console.log(first);
	console.log(second);
}

f1(list);

function f23(){
	if(Math.random()>0.5){
		return 2;
	}else {
		return 'Welcome';
	}
}
console.log(f23());

var y1 = function(abc){
	console.log(abc);
}
y1('chen');
function test(a,b,c,d){
	console.log(a,b,c,d);
}
test();test(1);test(1,2);test(1,2,3);test(1,2,3,4);test(1,2,3,4,5);

var obj = {num:2};
var add2this = function (a){
	return this.num+a;
};
console.log(add2this.call(obj,3));

var obj22={num:2};
var obj3={num2:4};
var add3this=function(a,b,c){
	return this.num2+a+b+c
};
console.log("*****************");
console.log(add3this.call(obj3,1,2,3));
var arr=[1,2,3];
console.log(add3this.apply(obj3,arr));
var bound=add3this.bind(obj3);
console.log(bound(1,2,3));
console.log("**********");
var Object1 = {a:1}; var Object2={b:2};
var emp = function(x,y){
	return this.b+x+y;
};
var boun=emp.bind(Object2);
console.log(boun(2,3));

var max = function(x,y){
	if(x>y)
	return x;
	return y;
};
console.log(max(2,3));
var dev = function(){console.log('I am callled from inside a function');};
var jason=function(callback) {
console.log("processing");
callback();
};
jason(dev);

function logNegative(number){
	var negative=-number;
	console.log(negative);
};
var newArray=[1,2,3,4,5];
newArray.forEach(logNegative);
newArray.forEach(function(number){
	var added = number+3;
	console.log(added);
});
var print = function(name){
	console.log(this.toUpperCase()+ ' '+ name.toUpperCase);
};
print.call('hello','Saran');
var print1 = function(firstName,lastName,middleName){
	console.log(this.toLowerCase()+ ' '+firstName+ '   '+lastName+' '+middleName);
};
print1.call('HELLO','Sanjay','Sahu','Jingiani');
var names=['Nikhil','Hari','Saran'];
print1.apply('hello',names);
var list1 = [1,2,3,4,5];
list1.forEach(function(e){console.log(e);});
list1.map(function(e){return a=e+2;}).forEach(function(e){console.log(e);});
list1.filter(function(e){return e%2==0;}).map(function(e){return a=e*2;}).forEach(function(e){console.log(e);});
list1.filter(e=>e*2 == 0).map(e=>e*2).forEach(e=>console.log(e));
// curried function technique using partial evaluation
var employees = function(a){
	return function(b){
		var result = 'Employee names are '.concat(a).concat(' and ').concat(b);
		return result;
	};
};
// curried function
var operatorEmp=employees('Esha');
console.log(operatorEmp('chen'));
console.log(operatorEmp(' '));
console.log(operatorEmp('Dev'));
console.log('********************************Promise******************************************');

var promiseToCleantheTrainingRoom = new Promise(function(resolve,reject){
	var isClean = true;
	if(isClean){
		resolve('cleaned');
	}else{
		reject('not cleaned');
	}
});

promiseToCleantheTrainingRoom.then(function(fromResolve){
	console.log('The Training room is '+fromResolve);
}).catch(function(fromReject){console.log('The Training room is '+fromReject);});

let cleanTheTrainingRoom = function(){
	return new Promise(function(resolve,reject){
		resolve(' Cleaned the Training Room, ');
	});
};
let removedTrash = function(message){
	return new Promise(function(resolve,reject){
		resolve(message+ ' removed the trash, ');
	});
};

let getRewards = function(message){
	return new Promise(function(resolve,reject){
		resolve(message+ ' you will be Rewarded , ');
	});
};
cleanTheTrainingRoom().then(function(message){
	return removedTrash(message);
}).then(function(message){
	return getRewards(message);
}).then(function(message){
	console.log('This is the message \n'+message);
});
Promise.all([cleanTheTrainingRoom(),removedTrash(),getRewards()]).then(function(){console.log('all finished at one time');});

//any of them finished
Promise.race([cleanTheTrainingRoom(),removedTrash(),getRewards()]).then(function(){console.log('Race all finished at one time')});

// currying function example1
var t1 = function(x){
	return function(y){
		return function(z){
			console.log(x+ ' '+ ' '+y+' '+z);
		};
	};
};
t1('Welcome')('you')('fish');

var a1 = t1('Welcome');
var a2 = a1('to the world of');
var a3 = a2('javascript');
console.log(a3);
