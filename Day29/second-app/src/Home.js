import SidePane from "./SidePane";
import EventsDemo from "./EventsDemo";
import UserHookDemo from "./UserHookDemo";

const Home = () => {
    return (
        <div className="home">
            <h2>Hi I am home Component!</h2>
            {/* <SidePane message={"demonstrating props from Home Component"}/> */}
            {/* <EventsDemo/> */}
            {/* <UserHookDemo tech={"java"}/> */}
        </div>
      );
}
 
export default Home;
