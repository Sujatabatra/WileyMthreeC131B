import SidePane
 from "./SidePane";
const Home = () => {
    return (
        <div className="home">
            <h2>Hi I am home Component!</h2>
            <SidePane message={"demonstrating props from Home Component"}/>
        </div>
      );
}
 
export default Home;
