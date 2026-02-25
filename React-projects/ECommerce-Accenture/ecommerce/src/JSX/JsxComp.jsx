import style from './JSXComp.module.css'

export function JSXComp(){
    return(
        <>
            <h2 style={{color:"yellow",background:"blue"}}> From JSX Comp</h2>
            <p1 className={style.temp}> Paragraph from JSX Comp</p1>
        </>
    )
}