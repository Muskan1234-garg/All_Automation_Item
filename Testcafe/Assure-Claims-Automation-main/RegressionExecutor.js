const { execSync } = require('child_process');
const testcafeCommand1 = "testcafe chrome TestScripts1/ --skip-js-errors -S --reporter html:HTMLReport/TestScripts1.html"
const testcafeCommand2 = "testcafe chrome TestScripts2/ --skip-js-errors -S --reporter html:HTMLReport/TestScripts2.html"
const testcafeCommand3 = "testcafe chrome TestScripts3/ --skip-js-errors -S --reporter html:HTMLReport/TestScripts3.html"
const testcafeCommand4 = "testcafe chrome TestScripts4/ --skip-js-errors -S --reporter html:HTMLReport/TestScripts4.html"
const testcafeCommand5 = "testcafe chrome TestScripts5/ --skip-js-errors -S --reporter html:HTMLReport/TestScripts5.html"
const testcafeCommand6 = "testcafe chrome TestScripts6/ --skip-js-errors -S --reporter html:HTMLReport/TestScripts6.html"
const testcafeCommand7 = "testcafe chrome TestScripts7/ --skip-js-errors -S --reporter html:HTMLReport/TestScripts7.html"
const testcafeCommand8 = "testcafe chrome InstanceTurnOff/ --skip-js-errors -S --reporter html:HTMLReport/InstanceTurnOff.html"


  try {

    execSync(testcafeCommand1, { stdio: 'inherit' });
  
    console.log("run scripts successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }


  try {

    execSync(testcafeCommand2, { stdio: 'inherit' });
  
    console.log("run scripts successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }

  try {

    execSync(testcafeCommand3, { stdio: 'inherit' });
  
    console.log("run scripts successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }


  try {

    execSync(testcafeCommand4, { stdio: 'inherit' });
  
    console.log("run scripts successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }

  try {

    execSync(testcafeCommand5, { stdio: 'inherit' });
  
    console.log("run scripts successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }

  try {

    execSync(testcafeCommand6, { stdio: 'inherit' });
  
    console.log("run scripts successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }
  try {

    execSync(testcafeCommand7, { stdio: 'inherit' });
  
    console.log("run scripts successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }
try {

    execSync(testcafeCommand8, { stdio: 'inherit' });
  
    console.log("run scripts successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }
