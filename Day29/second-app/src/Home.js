import SidePane from "./SidePane";
import EventsDemo from "./EventsDemo";

const Home = () => {
    return (
        <div className="home">
            <h2>Hi I am home Component!</h2>
            <SidePane message={"demonstrating props from Home Component"}/>
            <EventsDemo/>
        </div>
      );
}
 
export default Home;
