/*import Heading from "./components/heading"
const arr=[5,2,1];
console.log(arr)
const App = () => {
  return (
    <div>
      {arr.map(h=><Heading data={h}/>)}
    </div>
  )
}

export default App*/
/*import Heading from "./components/heading";
const App = () => {
  const arr=[];
  for(let i=1; i<26;i++)
    arr.push(i);
  return (
    <div>
      {arr.map(h=><Heading data={h}/>)}
    </div>
  )
}
export default App*/

/*import Heading from "./components/heading";
const App = () => {
  const arr=[];
  for(let i=1; i<26;i++)
    //arr.push(String.fromCharCode(64+i));
  arr.push(String.fromCharCode(96+i));//small 'a' print
  return (
    <div>
      {arr.map(h=><Heading data={h}/>)}
    </div>
  )
}
export default App*/
/*const App=()=>{
  return(
    <h1>Hello World!</h1>
  )
}
export default App*/
/*const App=()=>{
  return(5)
}
export default App*/
/*import FirstComponent from "./components/FirstComponent"
const arr=[1,3];
console.log(arr)
const App=()=>{
  return(
    <h1>{arr.map(h=><FirstComponent data={h}/>)}</h1>
  )
}
export default App*/

import FirstComponent from "./components/FirstComponent"
import Siddhu from "./components/siddhi"
const App = () => {
  return (
    <div>
      <FirstComponent/>
      <Siddhu/>
      
    </div>
  )
}

export default App
