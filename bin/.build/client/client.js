// Compiled by ClojureScript 0.0-2173
goog.provide('client');
goog.require('cljs.core');
client.greeting = (function greeting(){return "Welcome to basic-clojure.";
});
client.click_input = (function click_input(){if(typeof console !== 'undefined')
{return console.log("You pressed the button");
} else
{return null;
}
});
console.log("World!");
console.log(Meteor);
console.log();
if(cljs.core.truth_((Meteor["isClient"])))
{Template.hello.greeting = client.greeting.call(null,Template.hello.events = (function (){var obj4794 = {"click input":client.click_input};return obj4794;
})());
} else
{}
client.server_startup = (function server_startup(){return null;
});
if(cljs.core.truth_((Meteor["isServer"])))
{} else
{}
