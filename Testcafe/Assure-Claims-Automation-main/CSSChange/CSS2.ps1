#Read the CSS file into a string
$cssFilePath = "C:\Program Files (x86)\CSC\RiskmasterUX\rmacommon\commonRMA-04b0b3a88e - Copy (2).css"
$cssContent = Get-Content -Path $cssFilePath -Raw
 
 
$targetClass = ".tabbable-panel"
$propertyToChange = "overflow: overlay;"
$firstOccurrenceIndex = $cssContent.IndexOf($targetClass)
if ($firstOccurrenceIndex -ge 0) {
    $startIndex = $cssContent.IndexOf($propertyToChange, $firstOccurrenceIndex)
    if ($startIndex -ge 0) {
        # Calculate the end of the property to change
        $endIndex = $startIndex + $propertyToChange.Length
 
        # Replace the property with "overflow: auto;"
        $modifiedCssContent = $cssContent.Substring(0, $startIndex) + "overflow: auto;" + $cssContent.Substring($endIndex)
 
        # Write the modified CSS content back to the file
        Set-Content -Path $cssFilePath -Value $modifiedCssContent
        Write-Host "Property changed successfully for the first occurrence of $targetClass."
    } else {
        Write-Host "Property '$propertyToChange' not found within $targetClass."
    }
} else {
    Write-Host "Class '$targetClass' not found in the CSS file."
}
