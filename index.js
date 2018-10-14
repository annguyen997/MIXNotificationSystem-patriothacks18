(function() {

	var config = {
    apiKey: "AIzaSyCDxOgMEC1fneRvG_5DJeTLF09-VL0jd_c",
    authDomain: "hackathon18-a7918.firebaseapp.com",
    databaseURL: "https://hackathon18-a7918.firebaseio.com",
    projectId: "hackathon18-a7918",
    storageBucket: "hackathon18-a7918.appspot.com",
    messagingSenderId: "210022033391"
};
firebase.initializeApp(config);


const preObject= document.getElementById('object');
const ulList = document.getElementById('list');

const dbRefObject = firebase.database().ref().child('object');
const dbRefList = dbRefObject.child('hobbies');


dbReObject.on('value', snap =>{
	preObject.innerText = JSON.stringify(snao.val(), null, 3);

});
defRefList.on('child_added', snap => console.log(snap.val()));

}());