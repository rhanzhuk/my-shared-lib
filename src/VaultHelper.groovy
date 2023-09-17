class VaultHelper {
    String VAULT_ADDR = 'http://65.108.210.185:8211'
    String VAULT_USER = "****"
    String VAULT_PASS = "****"

    String getToken() {
        def vaultToken = sh (script: "curl -X POST --data '{\"password\" : \"'$VAULT_PASS'\"}' $VAULT_ADDR/v1/auth/userpass/login/$VAULT_USER | jq -r .auth.client_token")
        println vaultToken
        return vaultToken
    }
}
