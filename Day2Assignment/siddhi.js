const body = document.getElementById("home"); //element captured

const btn = document.createElement("button");
btn.innerHTML = "change color";

body.append(btn);

btn.addEventListener("click", ()=>{
   body.style.backgroundColor = body.style.backgroundColor == 'white' ? 'black' : 'white';
});


body.addEventListener("mouseenter", ()=>{
    body.style.backgroundColor = 'white';
})

body.addEventListener("mouseleave", ()=>{
    body.style.backgroundColor = 'black';
})