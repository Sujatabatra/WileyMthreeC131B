import { useEffect, useState } from "react";

const useFetch=(url)=>{
 const [data, setData] = useState(null);
  const [isPending,setIsPending]=useState(true);
  const [error,setError]=useState(null);

  useEffect(()=>{
    setTimeout(() => {
    //   fetch('http://localhost:8082/blogs')
      fetch(url)
    .then(res=>{
      return res.json();
    })
    .then(data=>{
      setData(data);
      setIsPending(false);
    })
    .catch(err=>{
      setIsPending(false);
      setError(err.message);
    })  
    }, 1000);
    
  },[url]);

  return {data,isPending,error};
}

export default useFetch;