
function App() {
  const title="Welcome to Sujata's Blog!"
  const likes=50;
  const link="http://www.google.com";
  // const person={fname:'sujata',lname:'batra'};
const status=false;
  return (
    <div className="content">
      <h1>{title}</h1>
      <p>Liked {likes} times</p>
      <p>Status : {status}</p>
      <p>Welcome to Sujata's React Application!</p>
      {"hello"}
      <p>{75}</p>
      <p>{[1,2,3,4,5]}</p>
      <p>{ Math.random() *10 }</p>

      {/* <a href="http://www.google.com">Google Site</a> */}
      <a href={link}>Google Site</a>
      {/* <p>{person}</p> */}
    </div>
  );
}

export default App;
