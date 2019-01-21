let a = (x,y) => x + y

let b = (x) => (y) => x + y

let c = b(1)

// c(5) returns 6

// ----------------------------------------- Simple higher order mathematics functions

let d = x => console.log(x)

let e = y => d(y)

// ----------------------------------------- 

let handleRoute = () => {

    wrappedhandlemessageA()
    wrappedhandlemessageB()
    wrappedhandlemessageC()
    wrappedhandlemessageD()

}

const newhandleroute = (wrappedhandlemessageA, wrappedhandlemessageB, wrappedhandlemessageC, wrappedhandlemessageD)

// -----------------------------------------

