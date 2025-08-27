Write-Host "PowerShell file copying script, with verification"

#copy dir to dir on PC
# cp -Path C:\Users\McDesmond\Music\ -Destination Z:\Sounds\themursiks\script\ -PassThru -Debug -Recurse
# Copy-Item -Path C:\Users\mcdes\Downloads\MediaHuman -Destination Z:\Sounds\themursiks\freshadds\newnewtunes -PassThru -Debug -Recurse

#ttesting on codinglaptop
# C:\Users\McDesmond\Documents\CoderMans
# Copy-Item -Path C:\Users\McDesmond\Documents\CoderMans -Destination C:\Users\McDesmond\Downloads\<folderalreadycreated> -PassThru -Debug -Recurse

#copy dir to S3
# aws S3 cp Z:\Sounds\themursiks\freshadds\newnewtunes s3://music--bucket/themursiks/freshadds/ --recursive
#OR
# aws S3 sync Z:\Sounds\themursiks\freshadds\newnewtunes s3://<bucket>

#test to S3
aws s3 cp C:\Users\McDesmond\Music\CNewTunes s3://themursiks/zznewstuff --recursive


Syntax

azcopy copy 'https://s3.amazonaws.com/music--bucket/themursiks/' 'https://musicvault.blob.core.windows.net/tunes/testtransfer'
C:\Users\McDesmond\Music\NewTunes
azcopy copy 'C:\Users\McDesmond\Music\' 'https://musicvault.blob.core.windows.net/tunes/testtransfer'

.\azcopy copy 'C:\Users\McDesmond\Music\' 'https://musicvault.blob.core.windows.net/tunes/testmusicbox' --recursive