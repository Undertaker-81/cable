class TinnedDto {
    constructor(id, name, children, isChecked, isExpanded, isChildrenLoading) {
        this.id = id
        this.name = name
        this.children = children
        this.isChecked = isChecked
        this.isExpanded = isExpanded
        this.isChildrenLoading = isChildrenLoading
    }
}
module.exports = TinnedDto;