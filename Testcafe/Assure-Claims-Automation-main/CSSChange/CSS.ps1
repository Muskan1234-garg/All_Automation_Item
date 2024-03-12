set-executionpolicy -executionpolicy unrestricted
$file="C:\Program Files (x86)\CSC\RiskmasterUX\rmacommon\commonRMA-04b0b3a88e - Copy (2).css"

$text = [IO.File]::ReadAllText($file)
$NewContent = [String]$text

#Write-Host $NewContent
 
$regex = @'
(?mis)html,
body {
    overflow: overlay;
}
'@

$replaceregex = @'
html,
body {
    overflow: auto;
}
'@


if ($text -match $regex){


Write-Host "true"

$text = $text -replace $regex, $replaceregex
        $text | Out-File $file -Force -Encoding utf8

 
#Set-Content -Path "C:\Intel\AssureClaims\powershell\test\commonRMA-8d13f64694.css" -Value $NewContent


}
else
{


Write-Host "false"


}

 

$regex = @'
(?mis)width: 74%;
    float: left;
    transition: width 1s;
    overflow-y: overlay;
'@

$replaceregex = @'
    width: 74%;
    float: left;
    transition: width 1s;
    overflow-y: auto;
'@

 

if ($text -match $regex){

 

Write-Host "true"

 

$text = $text -replace $regex, $replaceregex
        $text | Out-File $file -Force -Encoding utf8

 

#Set-Content -Path "C:\Intel\AssureClaims\powershell\test\commonRMA-8d13f64694.css" -Value $NewContent

 

}
else
{

 

Write-Host "false"

 

}

 

$regex = @'
(?mis).rightPanEx {
        overflow-y: overlay;
    }
'@

 
$replaceregex = @'
    .rightPanEx {
        overflow-y: auto;
    }
'@

 

if ($text -match $regex){

 

Write-Host "true"

 

$text = $text -replace $regex, $replaceregex
        $text | Out-File $file -Force -Encoding utf8

 

#Set-Content -Path "C:\Intel\AssureClaims\powrshell\test\commonRMA-8d13f64694.css" -Value $NewContent

 

}
else
{
	
Write-Host "false"


}

 