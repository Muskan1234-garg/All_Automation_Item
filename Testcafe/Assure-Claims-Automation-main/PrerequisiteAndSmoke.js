const { execSync } = require('child_process');

 

const npmCommand1 = 'npm i testcafe'; // npm command to run
const npmCommand2 = 'npm i faker'; // npm command to run
const npmCommand3 = 'npm audit fix --force'; // npm command to run

const npmCommand4 = 'npm i testcafe-reporter-html'; // npm command to run
const npmCommand5 = 'node TestcafeScriptCategorization.js'; // npm command to run
const testcafeCommand = "testcafe chrome SmokeAndPreRequisites/ --skip-js-errors -S --reporter html:HTMLReport/Report.html"



try {

  execSync(npmCommand1, { stdio: 'inherit' });

  console.log("installed successfully");

} catch (error) {

  console.error(`Error executing command: ${error.message}`);

}

try {

  execSync(npmCommand2, { stdio: 'inherit' });

  console.log("faker installed successfully");

} catch (error) {

  console.error(`Error executing command: ${error.message}`);

}
try {

  execSync(npmCommand3, { stdio: 'inherit' });

  console.log("audit installed successfully");

} catch (error) {

  console.error(`Error executing command: ${error.message}`);

}

 

try {

  execSync(npmCommand4, { stdio: 'inherit' });

  console.log("installed successfully");

} catch (error) {

  console.error(`Error executing command: ${error.message}`);

}

try {

    execSync(npmCommand5, { stdio: 'inherit' });
  
    console.log("folders created successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }
  
  try {

    execSync(testcafeCommand, { stdio: 'inherit' });
  
    console.log("run scripts successfully");
  
  } catch (error) {
  
    console.error(`Error executing command: ${error.message}`);
  
  }
